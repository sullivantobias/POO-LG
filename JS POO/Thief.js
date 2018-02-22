

class Thief extends Caracter {
    constructor (pseudo, age) {
        super (pseudo,age);
        this.getRace = "Thief";
    }

    fight () {
        if (this.weapons) {
            window.document.write("I can use this "+this.getWeapons+"</br>");
        }
    }

}