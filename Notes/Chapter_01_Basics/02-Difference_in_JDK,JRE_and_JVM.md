# Difference in JDK, JRE and JVM
- JDK provides tools and libraries to develop Java applications.
	- JRE offers the libraries and JVM needed to run Java programs.
		- JVM executes the complied java bytecode from the system.
- JDK = JRE ( JVM + Libraries ) + Dev Tools (Compiler, Jar, javadoc, debugger)

### Working of JVM
1. Loading (loads btyecode into memory)
2. Linking (performs verification, preparation and resolution)
3. Initialization (Executes class constructors and static initializers)
4. Execution (Interprets/ compiles bytecode into native code)

|Aspect|JDK|JRE|JVM|
|---|---|---|---|
|Purpose|Used to develop Java applications|Used to run Java applications|Executes Java bytecode|
|Platform Dependency|Platform-dependent (OS specific)|Platform-dependent (OS specific)|JVM is OS-specific, but bytecode is platform-independent|
|Includes|JRE + Development tools (javac, debugger, etc.)|JVM + Libraries (e.g., rt.jar)|ClassLoader, JIT Compiler, Garbage Collector|
|Use Case|Writing and compiling Java code|Running a Java application on a system|Convert bytecode into native machine code|

## Install JDK and IDE
- To work with Java you need to install the JDK and and IDE
- For JDK
	- Go to the official oracle site and install latest Java version.
	- Install the JDK and add the path
		- Into the path (your bin location)
		- Into your enviroment location (your variable name and it's location)
- For IDE
	- Choose your fav one (such as IntelliJ or VS Code)
	- Go to their site and install it