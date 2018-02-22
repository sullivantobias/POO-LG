class Caracter { 
    constructor (pseudo , age) {
        if (this.constructor === Caracter) {
            throw new TypeError('Abstract class "Caracter" cannot be instantiated directly.'); 
        }
        this.pseudo = pseudo;
        this.age = age;
        var race, weapons = "", heal ="";
    }

    get getPseudo () {
        return this.pseudo;
    }

    get getAge () {
        return this.age;
    }

    get getRace () {
        return this.race;
    }

    set getRace (race) {
        this.race = race;
    }

    get getWeapons () {
        return this.weapons;
    }

    set getWeapons (weapons) {
        this.weapons = weapons;
    }

    get getHeal () {
        return this.heal;
    }

    set getHeal (heal) {
        this.heal = heal;
    }

    infos () {
        window.document.write ("My pseudo is "+this.getPseudo+
        ", my age is : "+this.getAge+ " and my race is "+this.getRace+"</br>");
    }

    walk () {
        window. document.write ("I'm walking as an : "+this.getRace+"</br>");
    }

    fight () {
        window.document.write('I can\'t fight </br>');
    }

    castHeal () {
        window.document.write('I can\'t heal</br>');
    }
}