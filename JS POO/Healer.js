
class Healer extends Caracter {
    constructor (pseudo, age) {
        super (pseudo,age);
        this.getRace = "Healer";
    }

    castHeal () {
        if (this.heal) {
            window.document.write("I can use this "+this.getHeal);
        }
    }

}