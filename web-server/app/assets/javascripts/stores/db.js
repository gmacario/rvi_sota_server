define(function(require) {
  var atom = require('../lib/atom');

  var DB = (function() {
    function DB() {
      this.updates = atom.createAtom([
      ]);
      this.showUpdate = atom.createAtom({});
      this.updateStatus = atom.createAtom({});

      this.packagesForFilter = atom.createAtom([]);
      this.filtersForPackage = atom.createAtom([]);
      this.packages = atom.createAtom([]);
      this.showPackage = atom.createAtom({});
      this.searchablePackages = atom.createAtom([]);

      this.filters = atom.createAtom([]);
      this.searchableFilters = atom.createAtom([]);
      this.showFilter = atom.createAtom({});

      this.searchableVehicles = atom.createAtom([]);
      this.postStatus = atom.createAtom([]);
    }

    return DB;
  })();

  return new DB();

});
