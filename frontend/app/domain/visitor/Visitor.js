class Visitor {
    constructor(_name, _date) {
        Object.assign(this, { _name });
        this._date = new Date(date.getTime());
        Object.freeze(this);
    }

    get name() {
        return this._name;
    }

    get date() {
        return new Date(this._date.getTime());
    }
}
