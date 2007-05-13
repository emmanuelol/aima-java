package aima.probability.decision;

import aima.util.Triplet;

public class MDPTransition<STATE_TYPE, ACTION_TYPE> {
	private Triplet<STATE_TYPE, ACTION_TYPE, STATE_TYPE> triplet;

	public MDPTransition(STATE_TYPE initial, ACTION_TYPE action,
			STATE_TYPE destination) {
		this.triplet = new Triplet<STATE_TYPE, ACTION_TYPE, STATE_TYPE>(
				initial, action, destination);
	}

	public STATE_TYPE getInitialState() {
		return triplet.getFirst();
	}

	public ACTION_TYPE getAction() {
		return triplet.getSecond();
	}

	public STATE_TYPE getDestinationState() {
		return triplet.getThird();
	}

	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		if (!(o instanceof MDPTransition)) {
			return false;
		}
		MDPTransition<STATE_TYPE, ACTION_TYPE> other = (MDPTransition<STATE_TYPE, ACTION_TYPE>) (o);// weird
																									// typing
																									// issue
																									// work
																									// out
																									// later
		return triplet.equals(other.triplet);
	}

	public int hashCode() {
		return triplet.hashCode();
	}
	
	public String toString(){
		return triplet.toString();
	}

}