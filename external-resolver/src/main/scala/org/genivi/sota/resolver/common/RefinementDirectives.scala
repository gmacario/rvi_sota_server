/**
 * Copyright: Copyright (C) 2015, Jaguar Land Rover
 * License: MPL-2.0
 */
package org.genivi.sota.resolver.common

import akka.http.scaladsl.server.{Directives, Directive1}
import org.genivi.sota.data.PackageId
import org.genivi.sota.resolver.components.Component
import org.genivi.sota.resolver.filters.Filter
import org.genivi.sota.rest.Validation._
import Directives._

/**
  * Helpers for extracting refined values from the URL.
  */

object RefinementDirectives {

  val refinedFilterName: Directive1[Filter.Name] =
    refined[Filter.ValidName](Slash ~ Segment)

  val refinedPackageId: Directive1[PackageId] =
    (refined[PackageId.ValidName](Slash ~ Segment) &
     refined[PackageId.ValidVersion](Slash ~ Segment))
       .as[PackageId](PackageId.apply _)

  val refinedPartNumber: Directive1[Component.PartNumber] =
    refined[Component.ValidPartNumber](Slash ~ Segment)
}