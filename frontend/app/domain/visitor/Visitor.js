class Visitor {
    constructor(name, date) {
        this._name = name;
        this._date = date;
        Object.freeze(this)
    }

    get name() {
        return this._name;
    }

    get date() {
        return this._date;
    }
}
