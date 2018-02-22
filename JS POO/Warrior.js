
class Warrior extends Caracter {
    constructor (pseudo, age) {
        super (pseudo,age);
        this.getRace = "Warrior";
    }

    fight () {
        if (this.weapons) {
            window.document.write("I can use this "+this.getWeapons+"</br>");
        }
    }

}