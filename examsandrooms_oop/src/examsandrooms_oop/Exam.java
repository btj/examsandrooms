package examsandrooms_oop;

import java.util.HashSet;
import java.util.Set;

import logicalcollections.LogicalSet;

/**
 * Each instance of this class represents a exam
 * in an exams-and-rooms graph.
 * 
 * @invar | getRooms().stream().allMatch(r -> r.getExams().contains(this))
 */
public class Exam {
	
	/**
	 * @invar | rooms != null
	 * @invar | rooms.stream().allMatch(r -> r != null)
	 * @invar | rooms.stream().allMatch(r -> r.exams.contains(this))
	 * @representationObject
	 * @peerObjects
	 */
	HashSet<Room> rooms = new HashSet<>();
	
	/**
	 * @post | result != null
	 * @creates | result
	 * @post | result.stream().allMatch(r -> r != null)
	 * @peerObjects
	 */
	public Set<Room> getRooms() { return Set.copyOf(rooms); }
	
	/**
	 * @post | getRooms().isEmpty()
	 */
	public Exam() {}
	
	/**
	 * @pre | room != null
	 * @mutates_properties | getRooms(), room.getExams()
	 * @post | getRooms().equals(LogicalSet.plus(old(getRooms()), room))
	 * @post | room.getExams().equals(LogicalSet.plus(old(room.getExams()), this))
	 */
	public void addRoom(Room room) {
		rooms.add(room);
		room.exams.add(this);
	}
	
	/**
	 * @pre | room != null
	 * @mutates_properties | getRooms(), room.getExams()
	 * @post | getRooms().equals(LogicalSet.minus(old(getRooms()), room))
	 * @post | room.getExams().equals(LogicalSet.minus(old(room.getExams()), this))
	 */
	public void removeRoom(Room room) {
		rooms.remove(room);
		room.exams.remove(this);
	}

}
