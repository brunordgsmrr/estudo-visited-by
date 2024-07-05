class VisitorController {

    constructor () {

        let $ = document.querySelector.bind(document);

        this._name = $('#name');
        this._data = new Date();
    }

    adiciona (event) {
        event.preventDefault();
        console.log(this._name.value);
    }
}