package assessment19sep;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class ScoreAnalyzer{
	
	private int runsData;
	
	public ScoreAnalyzer() {
		// TODO Auto-generated constructor stub
		super();
	}
	public ScoreAnalyzer(int runsData) {
		super();
		this.runsData=runsData;
	}
	List<Integer> runlist=new LinkedList<Integer>();
	public void addRunsToList(int runsData){
		runlist.add(runsData);
	}
	public float calcRunRate() {
		float runRate=0;
		for(int i=0;i<5;i++) {
			runRate=runRate+runlist.get(i);
		}
		return (runRate/50);
	}
	public int lowestRunsScored() {
		int lowestrun=Collections.min(runlist);
		return lowestrun;
	}
	public void displayRuns() {
		int i=1;
		for(Integer run:runlist){
			System.out.print(i+"-"+run+" ");
			i=i+1;
		}
	}
	
	public int getRunsData() {
		return runsData;
	}
	public void setRunsData(int runsData) {
		this.runsData = runsData;
	}
}
public class TestScoreAnalyzer {
	
	public static void main(String args[]) {
		int i;
		ScoreAnalyzer analyzer=new ScoreAnalyzer();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Runs ");
		
		for(i=0;i<5;i++) {
			int runInputByPlayer=input.nextInt();
			analyzer.addRunsToList(runInputByPlayer);
		}
		analyzer.displayRuns();
		System.out.println("\nRunrate : "+analyzer.calcRunRate());
		System.out.println("Lowest Runs : "+(analyzer.lowestRunsScored()));
		System.out.println("Count of player who batted : "+analyzer.runlist.size());
		
		
	}
	
}