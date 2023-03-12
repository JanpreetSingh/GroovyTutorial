package groovyClassTutorials

import groovy.transform.Canonical
import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString
import groovy.transform.TupleConstructor

/* The @Canonical meta-annotation combines the annotations:
@ToString
@EqualsAndHashCode
@TupleConstructor
*/
@Canonical
class Email {
	
	String prospectName
	String emailAddress
	String notes
	
	String displayEmailContents() {
		return "Receipient: $prospectName \n Address: $emailAddress \n Notes: $notes"
	}
	

}
