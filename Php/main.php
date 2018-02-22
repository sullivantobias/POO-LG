<?php 

require_once('loadingClass.php');


$caracter = [ new Warrior ("Borsh", 22), new Thief ("Backstabber", 40) , new Healer ("Healish", 60)];
$weapons = ["Sword" , "Dagger" , "Sword"];
for ($i = 0; $i < count ($caracter) ; $i++) {
    echo "<strong>Section of : ".get_class($caracter[$i])."</strong></br>";
    $caracter[$i] -> infos ();
    $caracter[$i] -> walk ();
    $caracter[$i] -> setWeapons ($weapons[$i]);
    $caracter[$i] -> fight();
    $caracter[$i] -> setHeal (true);
    $caracter[$i] -> heal ();
    echo "</br>";
    echo "</br>";
}


?>