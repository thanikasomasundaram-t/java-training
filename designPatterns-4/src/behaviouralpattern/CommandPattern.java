package behaviouralpattern;

public class CommandPattern {
	public static void main(String[] args) {
		Speaker speaker = new Speaker();
		
		//calling executor
		SpeakerRemote speakerRemote = new SpeakerRemote();
		
		//setting set of commands to executor
		speakerRemote.setCommand(0, new AttentionCommand(speaker));
		speakerRemote.setCommand(1, new AtEaseCommand(speaker));
		speakerRemote.setCommand(2, new AttentionCommand(speaker));
		speakerRemote.setCommand(3, new MarchCommand(speaker));
		
		speakerRemote.executeCommand(0);
		speakerRemote.executeCommand(1);
		speakerRemote.executeCommand(2);
		speakerRemote.executeCommand(3);
		
	}
}


class SpeakerRemote {
	Command[] command = new Command[4];
	
	public void setCommand(int slot, Command cc) {
		command[slot]=cc;
	}
	
	public void executeCommand(int slot) {
		command[slot].execute();
	}
}


// receiver
class Speaker {
	Speaker() {
		System.out.println("Hi I am speaker");
	}
	
	//receiver action
	public void promptAttention() {
		System.out.println("Speaker: Attention soldiers");
	}
	
	//receiver action
	public void promptlMarch() {
		System.out.println("Speaker: Soldiers!!! March");
	}
	
	//receiver action
	public void promptAtEase() {
		System.out.println("Speaker: At Ease Soldiers");
	}
}


abstract class Command {
	abstract public void execute();
}
// command to trigger action marchCommand
class MarchCommand extends Command {
	Speaker speaker;
	
	public MarchCommand(Speaker speaker) {
		this.speaker = speaker;
	}



	@Override
	public void execute() {
		speaker.promptlMarch();
		
	}
	
}

//command to trigger action AttentionCommand
class AttentionCommand extends Command {
	Speaker speaker;
	
	public AttentionCommand(Speaker speaker) {
		this.speaker = speaker;
	}



	@Override
	public void execute() {
		speaker.promptAttention();
		
	}
	
}

//command to trigger action atEaseCommand
class AtEaseCommand extends Command {
	Speaker speaker;
	
	public AtEaseCommand(Speaker speaker) {
		this.speaker = speaker;
	}
	
	@Override
	public void execute() {
		speaker.promptAtEase();
	}
	
}