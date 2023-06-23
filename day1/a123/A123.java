package a123;

public class A123 {}

class A1 {
/*
 * two cases of hierarchy:
 * engineering program -> specific branch -> graduate or post graduate
 * lecturer -> full time lecturer or visiting member
 * 
 * common behavior among the day scholar, host-elite, graduate and post graduate students:
 * is a student, admitted into the college, registered, can apply for courses, needs to select 2 electives (from some semester)
 * receives and can view marks and attendance info
 * 
 * different layers possible in this system, in terms of the users of the systems:
 * student
 * 		apply for course, different views for grad vs post grad course requirements
 * 		view marks and attendance details for each course
 * lecturer
 *	 	target days for full time, salary, number of lectures for visiting members
 *		update marks and attendance details for each student for each course
 * Head of Department
 * 		allocate courses to lecturers (within dept)
 * admin staff
 * 		login with id and password
 * 		register students in courses
 * 		view list of student information (incl residential status and related info)
 * 		view list of lecturer information (incl pay and related info)
 * 		view list of lecturer-course history
 * 		view course-student registration
 * 
 * To accumulate a report of Student ID, Student Name, Marks scored, Lecturer name, Course registered
 * for each student, maintain a list of all courses (unique to semester) registered in, where details for each course include marks
 * for each student, maintain student name
 * for each course (unique to semester), maintain lecturer name
 */
}

class A2 {
/*
 * Student class attributes:
 * 		exposed: id, name, grad or post grad, day scholar or host-elite
 * 		hidden: course history (incl marks and attendance), hostel+room+fees for host-elite
 * 
 * To calculate grades,
 * 		we only need 1 method for all types of students. The name and signature and code should all be the same,
 * 		because each Student should take a Course that structures grades in the same way.
 * 
 * To calculate fees,
 * 		we need 2 methods, because the host-elite students have a hostel fee property that day scholars don't have
 * 
 * For the above questions, we are implementing
 * 		encapsulation to include Course and Grade information in Student
 * 		polymorphism and inheritance to treat the different types of Students and different types of Courses in the same way when calculating grades, regardless of specifics about the students/courses
 * 		polymorphism to overload the fee calculation
 */
}

class A3 {
/*
 * 1. state (jack is the name of a student)
 * 2. class (graduates, post graduates, day scholars, and host-elites share common behavior of this)
 * 3. identity (tom is a post graduate student and is a topper)
 * 4. encapsulation (the attribute and the activities related to a student are part of Student class)
 * 5. object (there is a student in graduation class, whose id is 1001, name jack, attending OS)
 * 6. behaviors (the student pays fees and the calculation is done by the admin)
 * 7. inheritance (a day scholar is a type of student)
 * 8. abstraction (a student can only view marks, he cannot update it)
 * 9. polymorphism (i use calculateFees method, be it host-elite or day scholar)
 */
}
