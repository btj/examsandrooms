package examsandrooms_oop;

import java.util.HashSet;
import java.util.Set;

/**
 * Each instance of this class represents a room
 * in an exams-and-rooms graph.
 * 
 * @invar | getExams().stream().allMatch(e -> e.getRooms().contains(this))
 */
public class Room {
	
	/**
	 * @invar | exams != null
	 * @invar | exams.stream().allMatch(e -> e != null)
	 * @invar | exams.stream().allMatch(e -> e.rooms.contains(this))
	 * @representationObject
	 * @peerObjects
	 */
	HashSet<Exam> exams = new HashSet<>();

	/**
	 * @post | result != null
	 * @creates | result
	 * @post | result.stream().allMatch(e -> e != null)
	 * @peerObjects
	 */
	public Set<Exam> getExams() { return Set.copyOf(exams); }
	
	/**
	 * @post | getExams().isEmpty()
	 */
	public Room() {}
	
}
