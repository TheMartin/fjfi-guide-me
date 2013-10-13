# Pov�d�n� o map�ch #

Mapy jsou standardn� reprezentov�ny (orientovan�mi) grafy. Vrcholy p�edstavuj� m�stnosti, p��padn� v�tahy, eskal�tory, schodi�t� nebo �seky chodeb�souhrnn� jim budeme ��kat **lokace**. Hrany jsou p�echody mezi jednotliv�mi lokacemi, a� u� jde o dve�e nebo o abstraktn�j�� p�echody jako zat��ky v chodb�ch. Ka�d� hrana je pak ohodnocen� d�lkou (pro n�s �asem, kter� zabere hranu p�ekonat). Na takov� graf m��eme pro nalezen� nejkrat�� cesty pou��t celou �k�lu algoritm� (tak�e nejsp� skon��me u A* nebo u Dijkstrova algoritmu).

![](images/graf1.png)
![](images/graf1_cesta.png)

Takov� graf n�m ud�v� jen *topologii* mapy���k� jen, odkud je mo�n� kam proj�t. U� ale neporad�, kudy se m� p��padn� u�ivatel ub�rat (v pojmech jako "jdi rovn�" nebo "zahni vlevo"), tj. ne��k� nic o *geometrii* mapy. Pokud to chceme napravit, m��eme p�idat ke ka�d� lokaci (tedy nap�. �seku chodby) n�kolik **uzl�**, tj. bod� na map�, kter� by m�l u�ivatel proj�t, pokud se t�eba chce dostat z chodby do m�stnosti. V ka�d� lokaci je tedy po jednom uzlu pro ka�dou hranu, kter� z n� vych�z�. Pokyny pro u�ivatele jsou pak formulovan� pomoc� uzl�, proto�e p�echod z uzlu v jedn� lokaci do uzlu v druh� lokaci je vlastn� tot�, co p�echod po hran�.

![](images/graf2.png)
![](images/graf2_cesta.png)

Tato �prava odhaluje jist� z�drhel toho, kdy� vyhled�v�n� cesty prob�h� na grafu tvo�en�m jen lokacemi. Proto�e mezi dv�ma lokacemi je v�dy jen jedna hrana, takov� cesta m� v�dy stejnou d�lku. Jen�e pokud je lokac� nap�. �sek chodby, tak se d�lka cesty li�� podle toho, z kter� strany jsme do chodby vstoupili a kde z n� pot�ebujeme uhnout. M��e se tedy nap��klad st�t, �e kdy� chodby tvo�� okruh, tak A* vyhodnot� jako v�hodn�j�� j�t jedn�m sm�rem, kdy� ve skute�nosti je v�hodn�j�� p�ij�t z druh� strany. �e�en� je nasnad�: roli vrchol� ve vyhled�vac�m grafu mus� m�sto lokac� hr�t uzly, a v�echny uzly v r�mci stejn� lokace musej� b�t navz�jem propojeny pat�i�n� ohodnocen�mi hranami. Na takov� graf u� A* pou��t m��eme.

![](images/graf3.png)
![](images/graf3_cesta.png)


### Shrnut� ###
* **lokace** zahrnuje jeden nebo v�ce uzl� a reprezentuje smyslupln� celek na map�, tj. m�stnost, v�tah, chodbu apod.
* **uzel** p�edstavuje konkr�tn� m�sto, kde �lov�k opou�t� lokaci (a vstupuje do jin�)
* **hrana** spojuje dva uzly, a p�edstavuje bu� p�echod z jedn� lokace do druh� (pokud je ka�d� uzel z jin� lokace) nebo p�esun v r�mci jedn� lokace (cesta od jedn�ch dve�� k druh�m)
