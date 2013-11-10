package cz.fjfi.guideme.core;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

import cz.fjfi.guideme.core.GMMap;

public class tst2 {

	/**
	 * @param args
	 */
	public static GMMap testmap2(UUID guid1, UUID guid2) // pot�ebujeme vr�tit mapu
	{
		GMMap myMap = new GMMap();
		myMap.setAuthorName("KBen");
		myMap.setAuthorEmail("email@email.com");
		myMap.setDescription("Okol� m�stnosti T-115");
		myMap.setGuid(Utility.generateGUID());
		myMap.setName("my map2");
		
		Location loc = new Location(Utility.generateGUID(),"loc","test location", myMap);
        UUID locguid = Utility.generateGUID();
        List<UUID> loclist = new LinkedList<UUID>();
        loclist.add(locguid);
		myMap.addLocation(loc);
		
		//System.out.print(n1.exportXML());
		GMNode n01 = new GMNode(guid1, 					"n01", loclist, "WC", myMap);
		GMNode n02 = new GMNode(Utility.generateGUID(), "n02", loclist, "chodba", myMap);
		GMNode n03 = new GMNode(Utility.generateGUID(), "n03", loclist, "chodba", myMap);
		GMNode n04 = new GMNode(Utility.generateGUID(), "n04", loclist, "chodba", myMap);
		GMNode n05 = new GMNode(Utility.generateGUID(), "n05", loclist, "schodi�t�", myMap);
		GMNode n06 = new GMNode(Utility.generateGUID(), "n06", loclist, "m�stnost T-1xx", myMap);
		GMNode n07 = new GMNode(Utility.generateGUID(), "n07", loclist, "hlavn� chodba KM", myMap);
		GMNode n08 = new GMNode(Utility.generateGUID(), "n08", loclist, "hlavn� chodba KM", myMap);
		GMNode n09 = new GMNode(Utility.generateGUID(), "n09", loclist, "hlavn� chodba KM", myMap);
		GMNode n10 = new GMNode(Utility.generateGUID(), "n10", loclist, "severn� chodba KM", myMap);
		GMNode n11 = new GMNode(Utility.generateGUID(), "n11", loclist, "severn� chodba KM", myMap);
		GMNode n12 = new GMNode(Utility.generateGUID(), "n12", loclist, "kancel�� KM", myMap);
		GMNode n13 = new GMNode(Utility.generateGUID(), "n13", loclist, "severn� chodba KM", myMap);
		GMNode n14 = new GMNode(Utility.generateGUID(), "n14", loclist, "m�stnost T-115", myMap);
		GMNode n15 = new GMNode(Utility.generateGUID(), "n15", loclist, "severn� chodba KM", myMap);
		GMNode n16 = new GMNode(Utility.generateGUID(), "n16", loclist, "m�stnost T-1xx", myMap);
		GMNode n17 = new GMNode(Utility.generateGUID(), "n17", loclist, "hlavn� chodba KM", myMap);
		GMNode n18 = new GMNode(Utility.generateGUID(), "n18", loclist, "m�stnost T-1xx", myMap);
		GMNode n19 = new GMNode(guid2, 				    "n19", loclist, "hlavn� chodba KM", myMap);
		myMap.addNode(n01);
		myMap.addNode(n02);
		myMap.addNode(n03);
		myMap.addNode(n04);
		myMap.addNode(n05);
		myMap.addNode(n06);
		myMap.addNode(n07);
		myMap.addNode(n08);
		myMap.addNode(n09);
		myMap.addNode(n10);
		myMap.addNode(n11);
		myMap.addNode(n12);
		myMap.addNode(n13);
		myMap.addNode(n14);
		myMap.addNode(n15);
		myMap.addNode(n16);
		myMap.addNode(n17);
		myMap.addNode(n18);
		myMap.addNode(n19);
		
		//Sm�r 1
		//lokace 1
		GMEdge e0102 = new GMEdge(Utility.generateGUID(), "e0102", 0, n01, n02, 	Direction.South, 	"odchod z WC", myMap, myMap.getLocations());
		GMEdge e0203 = new GMEdge(Utility.generateGUID(), "e0203", 1600, n02, n03, 	Direction.South, 	"chodba", myMap, myMap.getLocations());
		GMEdge e0204 = new GMEdge(Utility.generateGUID(), "e0204", 2000, n02, n04, 	Direction.Southeast, "chodba", myMap, myMap.getLocations());
		GMEdge e0304 = new GMEdge(Utility.generateGUID(), "e0304", 2000, n03, n04, 	Direction.Northeast, "chodba", myMap, myMap.getLocations());
		GMEdge e0405 = new GMEdge(Utility.generateGUID(), "e0405", 0, n04, n05, 	Direction.East, 	"vstup na schodi�t�", myMap, myMap.getLocations());
		 
		GMEdge e0307 = new GMEdge(Utility.generateGUID(), "e0307", 0, n03, n07, 	Direction.South, 	"vstup na KM", myMap, myMap.getLocations());
		//lokace 2
		GMEdge e0608 = new GMEdge(Utility.generateGUID(), "e0608", 0, n06, n08, 	Direction.East, 	"odchod z m�stnosti T-1xx", myMap, myMap.getLocations());
		GMEdge e0708 = new GMEdge(Utility.generateGUID(), "e0708", 700, n07, n08, 	Direction.Southwest, "hlavn� chodba KM", myMap, myMap.getLocations());
		GMEdge e0709 = new GMEdge(Utility.generateGUID(), "e0709", 700, n07, n09, 	Direction.Southeast, "hlavn� chodba KM", myMap, myMap.getLocations());
		GMEdge e0717 = new GMEdge(Utility.generateGUID(), "e0717", 5600, n07, n17, 	Direction.South, 	"hlavn� chodba KM", myMap, myMap.getLocations());
		GMEdge e0719 = new GMEdge(Utility.generateGUID(), "e0719", 8900, n07, n19, 	Direction.South, 	"hlavn� chodba KM", myMap, myMap.getLocations());
		GMEdge e0809 = new GMEdge(Utility.generateGUID(), "e0809", 1100, n08, n09, 	Direction.East, 	"hlavn� chodba KM", myMap, myMap.getLocations());
		GMEdge e0817 = new GMEdge(Utility.generateGUID(), "e0817", 5000, n08, n17, 	Direction.South, 	"hlavn� chodba KM", myMap, myMap.getLocations());
		GMEdge e0819 = new GMEdge(Utility.generateGUID(), "e0819", 8200, n08, n19, 	Direction.South, 	"hlavn� chodba KM", myMap, myMap.getLocations());
		GMEdge e0917 = new GMEdge(Utility.generateGUID(), "e0917", 4800, n09, n17, 	Direction.South, 	"hlavn� chodba KM", myMap, myMap.getLocations());
		GMEdge e0919 = new GMEdge(Utility.generateGUID(), "e0919", 8200, n09, n19, 	Direction.South, 	"hlavn� chodba KM", myMap, myMap.getLocations());
		GMEdge e1719 = new GMEdge(Utility.generateGUID(), "e1719", 3000, n17, n19, 	Direction.South, 	"hlavn� chodba KM", myMap, myMap.getLocations());
		GMEdge e1718 = new GMEdge(Utility.generateGUID(), "e1718", 0, n17, n18, 	Direction.East, 	"vstup do m�stnosti T-1xx", myMap, myMap.getLocations());
		 
		GMEdge e0910 = new GMEdge(Utility.generateGUID(), "e0910", 0, n09, n10, 	Direction.East, 	"vstup do severn� chodby KM", myMap, myMap.getLocations());
		//lokace 3 
		GMEdge e1011 = new GMEdge(Utility.generateGUID(), "e1011", 6800, n10, n11, 	Direction.East, 	"severn� chodba KM", myMap, myMap.getLocations());
		GMEdge e1013 = new GMEdge(Utility.generateGUID(), "e1013", 12200, n10, n13, Direction.East, 	"severn� chodba KM", myMap, myMap.getLocations());
		GMEdge e1015 = new GMEdge(Utility.generateGUID(), "e1015", 18600, n10, n15, Direction.East, 	"severn� chodba KM", myMap, myMap.getLocations());
		GMEdge e1113 = new GMEdge(Utility.generateGUID(), "e1113", 5000, n11, n13, 	Direction.East, 	"severn� chodba KM", myMap, myMap.getLocations());
		GMEdge e1115 = new GMEdge(Utility.generateGUID(), "e1115", 11400, n11, n15, Direction.East, 	"severn� chodba KM", myMap, myMap.getLocations());
		GMEdge e1315 = new GMEdge(Utility.generateGUID(), "e1315", 6000, n13, n15, 	Direction.East, 	"severn� chodba KM", myMap, myMap.getLocations());
		GMEdge e1112 = new GMEdge(Utility.generateGUID(), "e1112", 0, n11, n12, 	Direction.South, 	"vstup do kancel��e KM", myMap, myMap.getLocations());
		GMEdge e1314 = new GMEdge(Utility.generateGUID(), "e1314", 0, n13, n14, 	Direction.South, 	"vstup do m�stnosti T-115", myMap, myMap.getLocations());
		GMEdge e1516 = new GMEdge(Utility.generateGUID(), "e1516", 0, n15, n16, 	Direction.East, 	"vstup do m�stnosti T-1xx", myMap, myMap.getLocations());

		//Sm�r 2 - opa�n�
		//lokace 1
		GMEdge e0201 = new GMEdge(Utility.generateGUID(),"e0201", 0, n02, n01, Direction.North, "p��chod na WC" ,myMap, myMap.getLocations());
		GMEdge e0302 = new GMEdge(Utility.generateGUID(),"e0302", 1600, n03, n02, Direction.North, "chodba" ,myMap, myMap.getLocations());
		GMEdge e0402 = new GMEdge(Utility.generateGUID(),"e0402", 2000, n04, n02, Direction.Northwest,"chodba" ,myMap, myMap.getLocations());
		GMEdge e0403 = new GMEdge(Utility.generateGUID(),"e0403", 2000, n04, n03, Direction.Southwest,"chodba" ,myMap, myMap.getLocations());
		GMEdge e0504 = new GMEdge(Utility.generateGUID(),"e0504", 0, n05, n04, Direction.West, "odchod ze schodi�t�" ,myMap, myMap.getLocations());
                                                           
		GMEdge e0703 = new GMEdge(Utility.generateGUID(),"e0703", 0, n07, n03, Direction.North, "odchod z na KM" ,myMap, myMap.getLocations());
		//lokace 2
		GMEdge e0806 = new GMEdge(Utility.generateGUID(),"e0806", 0, n08, n06, Direction.West, "vstup do m�stnosti T-1xx" ,myMap, myMap.getLocations());
		GMEdge e0807 = new GMEdge(Utility.generateGUID(),"e0807", 700, n08, n07, Direction.Northeast,"hlavn� chodba KM" ,myMap, myMap.getLocations());
		GMEdge e0907 = new GMEdge(Utility.generateGUID(),"e0907", 700, n09, n07, Direction.Northwest,"hlavn� chodba KM" ,myMap, myMap.getLocations());
		GMEdge e1707 = new GMEdge(Utility.generateGUID(),"e1707", 5600, n17, n07, Direction.North, "hlavn� chodba KM" ,myMap, myMap.getLocations());
		GMEdge e1907 = new GMEdge(Utility.generateGUID(),"e1907", 8900, n19, n07, Direction.North, "hlavn� chodba KM" ,myMap, myMap.getLocations());
		GMEdge e0908 = new GMEdge(Utility.generateGUID(),"e0908", 1100, n09, n08, Direction.West, "hlavn� chodba KM" ,myMap, myMap.getLocations());
		GMEdge e1708 = new GMEdge(Utility.generateGUID(),"e1708", 5000, n17, n08, Direction.North, "hlavn� chodba KM" ,myMap, myMap.getLocations());
		GMEdge e1908 = new GMEdge(Utility.generateGUID(),"e1908", 8200, n19, n08, Direction.North, "hlavn� chodba KM" ,myMap, myMap.getLocations());
		GMEdge e1709 = new GMEdge(Utility.generateGUID(),"e1709", 4800, n17, n09, Direction.North, "hlavn� chodba KM" ,myMap, myMap.getLocations());
		GMEdge e1909 = new GMEdge(Utility.generateGUID(),"e1909", 8200, n19, n09, Direction.North, "hlavn� chodba KM" ,myMap, myMap.getLocations());
		GMEdge e1917 = new GMEdge(Utility.generateGUID(),"e1917", 3000, n19, n17, Direction.North, "hlavn� chodba KM" ,myMap, myMap.getLocations());
		GMEdge e1817 = new GMEdge(Utility.generateGUID(),"e1817", 0, n18, n17, Direction.West, "odchod z m�stnosti T-1xx" ,myMap, myMap.getLocations());
                                                           
		GMEdge e1009 = new GMEdge(Utility.generateGUID(),"e1009", 0, n10, n09, Direction.West, "vstup na hlavn� chodbu KM" ,myMap, myMap.getLocations());
		//lokace 3
		GMEdge e1110 = new GMEdge(Utility.generateGUID(),"e1110", 6800, n11, n10, Direction.West, "severn� chodba KM" ,myMap, myMap.getLocations());
		GMEdge e1310 = new GMEdge(Utility.generateGUID(),"e1310", 12200, n13, n10, Direction.West, "severn� chodba KM" ,myMap, myMap.getLocations());
		GMEdge e1510 = new GMEdge(Utility.generateGUID(),"e1510", 18600, n15, n10, Direction.West, "severn� chodba KM" ,myMap, myMap.getLocations());
		GMEdge e1311 = new GMEdge(Utility.generateGUID(),"e1311", 5000, n13, n11, Direction.West, "severn� chodba KM" ,myMap, myMap.getLocations());
		GMEdge e1511 = new GMEdge(Utility.generateGUID(),"e1511", 11400, n15, n11, Direction.West, "severn� chodba KM" ,myMap, myMap.getLocations());
		GMEdge e1513 = new GMEdge(Utility.generateGUID(),"e1513", 6000, n15, n13, Direction.West, "severn� chodba KM" ,myMap, myMap.getLocations());
		GMEdge e1211 = new GMEdge(Utility.generateGUID(),"e1211", 0, n12, n11, Direction.North, "odchod z kancel��e KM" ,myMap, myMap.getLocations());
		GMEdge e1413 = new GMEdge(Utility.generateGUID(),"e1413", 0, n14, n13, Direction.North, "odchod z m�stnosti T-115" ,myMap, myMap.getLocations());
		GMEdge e1615 = new GMEdge(Utility.generateGUID(),"e1615", 0, n16, n15, Direction.West, "odchod z m�stnosti T-1xx" ,myMap, myMap.getLocations());

		//System.out.print(e1.exportXML());
		myMap.addEdge(e0102);
		myMap.addEdge(e0203);
		myMap.addEdge(e0204);	
		myMap.addEdge(e0304);
		myMap.addEdge(e0405);	
		myMap.addEdge(e0307);	
		myMap.addEdge(e0608);
		myMap.addEdge(e0708);
		myMap.addEdge(e0709);	
		myMap.addEdge(e0717);
		myMap.addEdge(e0719);		
		myMap.addEdge(e0809);
		myMap.addEdge(e0817);		
		myMap.addEdge(e0819);
		myMap.addEdge(e0917);
		myMap.addEdge(e0919);
		myMap.addEdge(e1719);	
		myMap.addEdge(e1718);
		myMap.addEdge(e0910);
		myMap.addEdge(e1011);		
		myMap.addEdge(e1013);
		myMap.addEdge(e1015);
		myMap.addEdge(e1113);
		myMap.addEdge(e1115);	
		myMap.addEdge(e1315);
		myMap.addEdge(e1112);		
		myMap.addEdge(e1314);
		myMap.addEdge(e1516);		
		myMap.addEdge(e0201);
		myMap.addEdge(e0302);		
		myMap.addEdge(e0402);	
		myMap.addEdge(e0403);
		myMap.addEdge(e0504);	
		myMap.addEdge(e0703);
		myMap.addEdge(e0806);	
		myMap.addEdge(e0807);
		myMap.addEdge(e0907);		
		myMap.addEdge(e1707);
		myMap.addEdge(e1907);		
		myMap.addEdge(e0908);
		myMap.addEdge(e1708);		
		myMap.addEdge(e1908);
		myMap.addEdge(e1709);
		myMap.addEdge(e1909);
		myMap.addEdge(e1917);	
		myMap.addEdge(e1817);
		myMap.addEdge(e1009);
		myMap.addEdge(e1110);		
		myMap.addEdge(e1310);
		myMap.addEdge(e1510);		
		myMap.addEdge(e1311);
		myMap.addEdge(e1511);
		myMap.addEdge(e1513);
		myMap.addEdge(e1211);	
		myMap.addEdge(e1413);
		myMap.addEdge(e1615);	
		
		//File out = new File();//"D:\\adt-bundle-windows-x86-20130917\\adt-bundle-windows-x86-20130917\\workspace\\GitHub\\fjfi-guide-me\\out.txt");
		//myMap.exportXML(null);
		return myMap;
	}

}