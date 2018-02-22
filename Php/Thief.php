<?php 
require_once ("loadingClass.php");

class Thief extends Caracter{

    public function __construct ($pseudo, $age) {
        parent::__construct($pseudo, $age);
        $this -> setRace ("Thief");
    }

    public function fight () {
        if ($this -> weapons = "Dagger") {
            echo "</br> I can use this Dagger";
        }
    }

}


?>