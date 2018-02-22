<?php 
require_once ("loadingClass.php");

class Healer extends Caracter{

    public function __construct ($pseudo, $age) {
        parent::__construct($pseudo, $age);
        $this -> setRace ("Healer");
    }

    public function heal () {
        if ($this -> heal = 1) {
            echo '</br> I can use this medikit';
        }
    }

}


?>