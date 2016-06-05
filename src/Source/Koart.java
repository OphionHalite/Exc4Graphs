package Source;

import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;
import org.graphstream.algorithm.Dijkstra;
import org.graphstream.ui.view.Viewer;

public class Koart {
	
	private Graph koart;
	
	/**
	 * Initializes the graph
	 */
	public void init() {
		koart = new SingleGraph("Koarte");
		Viewer viewer = koart.display();
		viewer.disableAutoLayout();
		koart.addNode("Brugge").setAttribute("xyz",322,5121,0);
		koart.addNode("Kortrijk").setAttribute("xyz",326,5082,0);
		koart.addNode("Gent").setAttribute("xyz",372,5105,0);
		koart.addNode("Antwerpen").setAttribute("xyz",440,5122,0);;
		koart.addNode("Brussel").setAttribute("xyz",435,5085,0);
		koart.addNode("Leuven").setAttribute("xyz",470,5088,0);
		koart.addNode("Hasselt").setAttribute("xyz",533,5093,0);
		koart.addNode("Bergen").setAttribute("xyz",396,5045,0);
		koart.addNode("Waver").setAttribute("xyz",461,5072,0);
		koart.addNode("Namen").setAttribute("xyz",487,5047,0);
		koart.addNode("Luik").setAttribute("xyz",558,5063,0);
		koart.addNode("Neufchateau").setAttribute("xyz",543,4984,0);
		koart.addNode("Aarlen").setAttribute("xyz",581,4969,0);
		koart.addEdge("E403 Brugge-Kortrijk", "Brugge", "Kortrijk", true).addAttribute("TravelTime", 56);
		koart.addEdge("E40 Brugge-Gent", "Brugge", "Gent", true).addAttribute("TravelTime", 50);
		koart.addEdge("E34 Brugge-Antwerpen", "Brugge", "Antwerpen", true).addAttribute("TravelTime", 95);
		koart.addEdge("E17 Gent-Antwerpen", "Gent", "Antwerpen", true).addAttribute("TravelTime", 60);
		koart.addEdge("E40 Gent-Brussel", "Gent", "Brussel", true).addAttribute("TravelTime", 50);
		koart.addEdge("E42 Kortrijk-Bergen", "Kortrijk", "Bergen", true).addAttribute("TravelTime", 83);
		koart.addEdge("E19 Antwerpen-Brussel", "Antwerpen", "Brussel", true).addAttribute("TravelTime", 44);
		koart.addEdge("E313 Antwerpen-Hasselt", "Antwerpen", "Hasselt", true).addAttribute("TravelTime", 80);
		koart.addEdge("E313 Hasselt-Luik", "Hasselt", "Luik", true).addAttribute("TravelTime", 53);
		koart.addEdge("E314 Hasselt-Leuven", "Hasselt", "Leuven", true).addAttribute("TravelTime", 59);
		koart.addEdge("E40 Leuven-Brussel", "Leuven", "Brussel", true).addAttribute("TravelTime", 30);
		koart.addEdge("E40 Leuven-Luik", "Leuven", "Luik", true).addAttribute("TravelTime", 82);
		koart.addEdge("E42 Luik-Namen", "Luik", "Namen", true).addAttribute("TravelTime", 65);
		koart.addEdge("E25 Luik-Neufchateau", "Luik", "Neufchateau", true).addAttribute("TravelTime", 110);
		koart.addEdge("E19 Bergen-Brussel", "Bergen", "Brussel", true).addAttribute("TravelTime", 78);
		koart.addEdge("E42 Bergen-Namen", "Bergen", "Namen", true).addAttribute("TravelTime", 75);
		koart.addEdge("E411 Waver-Brussel", "Waver", "Brussel", true).addAttribute("TravelTime", 30);
		koart.addEdge("E411 Waver-Namen", "Waver", "Namen", true).addAttribute("TravelTime", 40);
		koart.addEdge("E411 Namen-Neufchateau", "Namen", "Neufchateau", true).addAttribute("TravelTime", 90);
		koart.addEdge("E25 Neufchateau-Aarlen", "Neufchateau", "Aarlen", true).addAttribute("TravelTime", 37);
		
		koart.addEdge("E403 Kortrijk-Brugge", "Kortrijk", "Brugge", true).addAttribute("TravelTime", 56);
		koart.addEdge("E40 Gent-Brugge", "Gent", "Brugge", true).addAttribute("TravelTime", 50);
		koart.addEdge("E34 Antwerpen-Brugge", "Antwerpen", "Brugge", true).addAttribute("TravelTime", 95);
		koart.addEdge("E17 Antwerpen-Gent", "Antwerpen", "Gent", true).addAttribute("TravelTime", 60);
		koart.addEdge("E40 Brussel-Gent", "Brussel", "Gent", true).addAttribute("TravelTime", 50);
		koart.addEdge("E42 Bergen-Kortrijk", "Bergen", "Kortrijk", true).addAttribute("TravelTime", 83);
		koart.addEdge("E19 Brussel-Antwerpen", "Brussel", "Antwerpen", true).addAttribute("TravelTime", 44);
		koart.addEdge("E313 Hasselt-Antwerpen", "Hasselt", "Antwerpen", true).addAttribute("TravelTime", 80);
		koart.addEdge("E313 Luik-Hasselt", "Luik", "Hasselt", true).addAttribute("TravelTime", 53);
		koart.addEdge("E314 Leuven-Hasselt", "Leuven", "Hasselt", true).addAttribute("TravelTime", 59);
		koart.addEdge("E40 Brussel-Leuven", "Brussel", "Leuven", true).addAttribute("TravelTime", 30);
		koart.addEdge("E40 Luik-Leuven", "Luik", "Leuven", true).addAttribute("TravelTime", 82);
		koart.addEdge("E42 Namen-Luik", "Namen", "Luik", true).addAttribute("TravelTime", 65);
		koart.addEdge("E25 Neufchateau-Luik", "Neufchateau", "Luik", true).addAttribute("TravelTime", 110);
		koart.addEdge("E19 Brussel-Bergen", "Brussel", "Bergen", true).addAttribute("TravelTime", 78);
		koart.addEdge("E42 Namen-Bergen", "Namen", "Bergen", true).addAttribute("TravelTime", 75);
		koart.addEdge("E411 Brussel-Waver", "Brussel", "Waver", true).addAttribute("TravelTime", 30);
		koart.addEdge("E411 Namen-Waver", "Namen", "Waver", true).addAttribute("TravelTime", 40);
		koart.addEdge("E411 Neufchateau-Namen", "Neufchateau", "Namen", true).addAttribute("TravelTime", 90);
		koart.addEdge("E25 Aarlen-Neufchateau", "Aarlen", "Neufchateau", true).addAttribute("TravelTime", 37);
		for (Node node : koart) {
	        node.addAttribute("ui.label", node.getId());
	    }
		for (Edge edge: koart.getEachEdge()){
			edge.addAttribute("Traffic", 0);
			edge.addAttribute("CrashChance", 0);
		}
	}
	
	/**
	 * Calculates the shortest path between two nodes.
	 * @param from
	 * @param to
	 * @return Path a list containing all edges on the shortest path
	 */
	public Path shortestPathTo(String from, String to){
		for (Node node: koart) node.addAttribute("ui.style", "fill-color: black;");
		for (Edge edge: koart.getEachEdge()) edge.addAttribute("ui.style", "fill-color: black;");
		
		Dijkstra dijkstra = new Dijkstra(Dijkstra.Element.EDGE, null, "TravelTime");
		dijkstra.init(koart);
		dijkstra.setSource(koart.getNode(from));
		dijkstra.compute();
		Path path = dijkstra.getPath(koart.getNode(to));
		
		for (Node node : dijkstra.getPathNodes(koart.getNode(to))) node.addAttribute("ui.style", "fill-color: blue;");
		//for (Edge edge : dijkstra.getPathEdges(koart.getNode(to))) edge.addAttribute("ui.style", "fill-color: blue;");
		
		dijkstra.clear();
		return path;
	}
	
	/**
	 * Updates the displayed graph with the new values
	 */
	public void updateEdges() {
		for (Edge edge : koart.getEachEdge()) {
	        edge.addAttribute("ui.label", ""+edge.getAttribute("TravelTime"));
	    }
	}
	
	/**
	 * Randomly generates a number of accidents
	 * @param road
	 * @return the amount of accidents that happened
	 */
	public int getAccidents(String road){
		int accidents = 0;
		for (int i=0; i<=(int)koart.getEdge(road).getAttribute("CrashChance"); i++){
			if ((int)(Math.random()*1000)==1){
				accidents++;
			}
		}
		if(accidents>0){
			addAccident(road,accidents);
		}
		return accidents;
	}
	
	/**
	 * Adds the given amount of traffic to the road
	 * @param int road to apply on
	 * @param int amount of traffic
	 */
	public void addTraffic(int road,int amount){
		addTraffic(koart.getEdge(road).getId(),amount);
	}
	
	/**
	 * Adds the given amount of traffic to the road
	 * @param String road to apply on
	 * @param int amount of traffic
	 */
	public void addTraffic(String road,int amount){
		System.out.println(amount*1000+" cars added to the "+road);
		Edge boane = koart.getEdge(road);
		boane.changeAttribute("TravelTime", (int)boane.getAttribute("TravelTime")+amount);
		boane.changeAttribute("Traffic", (int)boane.getAttribute("Traffic")+amount);
		boane.changeAttribute("CrashChance", (int)boane.getAttribute("CrashChance")+amount);
		getAccidents(road);
	}
	
	/**
	 * Adds the given amount off accidents to the road
	 * @param String road to apply on
	 * @param int amount of accidents
	 */
	public void addAccident(String road, int amount){
		Edge boane = koart.getEdge(road);
		System.out.println(amount+ " accident(s) happened on the "+road);
		int accidentWeight = 50*(amount-1)+30;								//Calculate added traveltime
		boane.changeAttribute("TravelTime", (int)boane.getAttribute("TravelTime")+accidentWeight);
		System.out.println(accidentWeight+" added to the "+road);
	}
	
	/**
	 * Simulates the graph 1 timestamp further
	 */
	public void passTime(){
		for (Edge edge: koart.getEachEdge()){
			edge.changeAttribute("CrashChance", (int)edge.getAttribute("CrashChance")+(int)edge.getAttribute("Traffic"));
		}
	}
}
