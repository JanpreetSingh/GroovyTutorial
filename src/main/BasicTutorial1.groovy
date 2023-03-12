package main

import org.codehaus.groovy.ast.stmt.CatchStatement

import jdk.nashorn.internal.ir.CatchNode

// PRINT
System.out.println("GROOVY Welcomes you")
System.out.println "Paranthesis can be skipped in functions call"

//Groovy can leverage Java built-in libraries:
println "Today Date is ::::::::::::::::::::::: " + new Date()

println "VARIABLES::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::"
var1 = 5
def var2 = 7

println "Explicit variable type declaration:"
int var3 =9
String name = "Apples Oranges"

println "var1 value: " +var1+ " |||| var2 value: " +var2+ " |||| var3 value: " +var3+ " |||| name class: " +name
println "var1 clas: " +var1.getClass()+ " |||| var2 class: " +var2.getClass()+ " |||| var3 class: " +var3.getClass()+ " |||| name class: " +name.getClass()

println "STRING Interpolation build in groovy strings known as g-strings::::::::::::::::::::::::"
println "var1 value: $var1 |||| var2 value: $var2"
println "sum of var1 and var2 :: ${var1+var2}"


println "Conditional STATEMENTS::::::::::::::::::::::::::::::::::::::::::::::::::::"
def myEarnings = 4000;

if (myEarnings<1000) {
	println "Earnings less than 1000"
} else if(myEarnings >1000 && myEarnings<3000) {
	println "Earnings between 1000 and 3000"
} else {
	println "Earnings greater than 3000"
}

myEarnings=1500;
switch(myEarnings) {
	case 0..999: println "Earnings less than 1000"
	break
	case 1000..2999: println "Earnings between 1000 and 3000"
	break
	default: println "Earnings greater than 3000"
}


println "LISTS ::::::::::::::::::::::::::::::::::::::::::::::::::::::"
List salaryList= [10,20,30,40,50];

for(int i=0;i<salaryList.size;i++) {
	println "List element : ${salaryList[i]}"
}


println "EXCEPTION Handling ::::::::::::::::::::::::::::::::::::::::::::::::"
// In Groovy it is optional to catch checked or unchecked exceptions
try {
	println name.toLong()
}catch(Exception e) {
//	Groovy provides assert for comparison
	assert e instanceof NumberFormatException
	println e.stackTrace
	println "Cannot convert a String to a Long"
}  

println "Exception Handled"










