<?php

session_start();
$_SESSION = array();
session_destroy();		

if ($_SESSION["prihlasen"]) {

	echo '<span class="errormsg">Nastala chyba: Relace se nedá odstranit!';	
	
} else {

	header("Location: http://kmlinux.fjfi.cvut.cz/~fortpet2/guideme/");	 
				
}

?>