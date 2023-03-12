package groovyClassTutorials

class EmailDetails {
	
static void main(String[] args) { 	

Email email1 = new Email()
email1.prospectName = "Groovy Learning Center"
email1.emailAddress = "learn@groovy.com"

// Groovy automatically creates SETTER and GETTER methods for public members of a class ********************************
email1.setNotes("Send list of  Groovy chapters")
println "Getter usecase Notes: " + email1.getNotes()

println email1.displayEmailContents()


//	Groovy ASSERT for comparison ********************************************
assert email1.toString() == "groovyClassTutorials.Email(Groovy Learning Center, learn@groovy.com, Send list of  Groovy chapters)"
println email1.toString()

// @ToString Annotation example ************************************************
assert email1.equals(email1);
assert !email1.equals(new Email("XYZ Center","xyz@xyz.com","List XYZ chapters"))
// @TupleConstructor Annotation example *****************************************
Email email2 = new Email("Groovy Learning Center", "learn@groovy.com", "Send list of  Groovy chapters")
// @EqualsAndHashCode Annotation example ****************************************
assert email1.hashCode() == email2.hashCode()
println "email1.hashCode() ::: ${email1.hashCode()}    email2.hashCode() ::::: ${email2.hashCode()}"










}


}
