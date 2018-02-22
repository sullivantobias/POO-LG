class Caracter():

    def __init__ (self, pseudo, age):
        self.pseudo = pseudo
        self.age = age
        self.race = ""
        self.weapons = ""
        self.heal = ""
    pass

    
    def getRace (self):
        return self.race

    def setRace (self, race):
        self.race = race

    def setWeapons (self, weapons):
         self.weapons = weapons

    def getWeapons (self):
        return self.weapons

    def setHeal (self, heal):
         self.heal = heal

    def getHeal (self):
        return self.heal

    def fight (self):
        print("I can't fight")

    def healing (self):
        print("I can't heal")

    def infos (self):
        print ("My pseudo is ",self.pseudo," , my age is ",self.age, " and my race is :",self.getRace())


class Warrior (Caracter): 
    def __init__(self, pseudo, age):
        Caracter.__init__(self, pseudo, age)
        self.setRace("Warrior")
                
    def walk (self):
        print ("I walk like a ",self.getRace())

    def fight (self):
        if self.weapons:
            print ("I can use this",self.getWeapons())

class Thief (Caracter): 
    def __init__(self, pseudo, age):
        Caracter.__init__(self, pseudo, age)
        self.setRace("Thief")

    def walk (self):
        print ("I walk like a ",self.getRace())

    def fight (self):
        if self.weapons:
            print ("I can use this",self.getWeapons())

class Healer (Caracter): 
    def __init__(self, pseudo, age):
        Caracter.__init__(self, pseudo, age)
        self.setRace("Healer")

    def walk (self):
        print ("I walk like a ",self.race)

    def healing (self):
        if self.heal:
            print ("I can use this",self.getHeal())


caracter = [ Warrior ("Garosh", 60), Thief ("BackStabber", 34), Healer ("Healish", 34)]
weapons = [ "Sword", "Dagger", "Stick"]
heal = "Medikit"

i = 0

for value in caracter:
    print("\n",caracter[i].__class__.__name__, "Section")
    print ("---------------------------------")
    caracter[i].setHeal(heal)
    caracter[i].setWeapons(weapons[i])
    caracter[i].infos()
    caracter[i].walk()
    caracter[i].fight()
    caracter[i].healing()
    
    i = i+1


