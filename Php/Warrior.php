<?php 
require_once ("loadingClass.php");

class Warrior extends Caracter{

    public function __construct ($pseudo, $age) {
        parent::__construct($pseudo, $age);
        $this -> setRace ("Warrior");
    }

    public function fight () {
        if ($this -> weapons = "Sword") {
            echo "</br> I can use this Sword";
        }
    }

}
?>