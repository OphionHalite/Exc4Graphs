package Source;

import org.graphstream.graph.Path;

public class HoehelRoete {

	public static void main(String[] args) throws InterruptedException{
		String start = args[0];
		String destination = args[1];
		Koart k = new Koart();
		k.init();
		Path previousPath = k.shortestPathTo(destination, start);
		for(int i=0; i<=1000; i++){
			//k.updateEdges();
			Path p = k.shortestPathTo(destination, start);
			if(!previousPath.equals(p)){
				System.out.println("Redirected to new shortest road:");
				int size = p.size();
				for (int j=1; j<size; j++){
					System.out.print(p.popNode().toString()+" -> ");
				}
				System.out.println(destination);
				previousPath = k.shortestPathTo(destination, start);
			}
			k.passTime();
			Thread.sleep(100);
			k.addTraffic((int)(Math.random()*39), 1);
		}
	}
}
