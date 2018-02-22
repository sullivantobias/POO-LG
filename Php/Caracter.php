<?php
abstract class Caracter {

    protected $pseudo, $age, $race, $weapons, $heal = false;

    public function __construct ($pseudo, $age) {
        $this -> pseudo = $pseudo;
        $this -> age = $age;
    }

    public function getPseudo () {
        return $this -> pseudo;
    }

    public function getAge () {
        return $this -> age;
    } 
    
    public function getRace () {
        return $this -> race;
    }

    public function setRace ($race) {
         $this -> race = $race ;
    }

    public function setWeapons ($weapons) {
        $this -> weapons = $weapons;
    }

    public function setHeal ($heal) {
        $this -> heal = $heal;
    }

    public function infos () {
        echo "My pseudo is : ".$this -> getPseudo(). "
         and my age is : ".$this -> getAge(). " , my race is : ".$this -> getRace();
    }

    public function walk () {
        echo "</br>I walk like a : ".$this -> getRace();
    }

    public function fight () {
        echo " </br> I can't fight";
    }

    public function heal () {
        echo " </br> I can't heal";
    }
}
?>