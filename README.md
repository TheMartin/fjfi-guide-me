fjfi-guide-me
=============

**P�r pozn�mek ke GitHubu:**

Sem do repozit��e samotn�ho pokud mo�no p�id�vejte opravdu jen v�ci, kter� se t�kaj� samotn�ho projektu: zdroj�ky, dokumentaci, XMLka a takov� v�ci. Pro n�vody, loga a v�echno co se t�k� n�vrhu projektu by m�lo j�t na wiki. Str�nky na wiki lze editovat p��mo p�es web, ale bohu�el p�es web nejdou p�idat obr�zky. Dobr� zpr�va je, �e wiki m� vlastn� repozit�� s vlastn� adres��ovou strukturou, kam to v�echno lze nahr�t. �patn� zpr�va je, �e klient GitHub for Windows neumo��uje p��m� p��stup (adresa repozit��e m� toti� p��ponu .wiki.git, a ten klient si neum� poradit s t�m, �e tam jsou dv� te�ky). Dobr� zpr�va je, �e to jde p�es p��kazovou ��dku. Pokud to tak chcete ud�lat, tak se to d�l� takhle:

  - otev�ete GitHub for Windows
  - v **local repositories** klikn�te prav�m tla��tkem a vyberte *open a shell here*
  - pomoc� `cd` se odposouvejte do adres��e, kam chcete um�stit lok�ln� kopii wiki
  - zadejte `git clone git@github.com:jandoubek/fjfi-guide-me.wiki.git`
  - zav�ete konzoli (`exit`) a vra�te se do GitHub for Windows
  - v **local repositories** by se m�l objevit nov� repozit�� **fjfi-guide-me.wiki**, a m�me hotovo