- RegEx are regular expressions.
- Regular expressions are matched with java.util.regex package
- Which consist of package of following class
	- Pattern
	- Matcher
	- PatternSyntaxException
## 1. Pattern class 
- It compiles regex strings into pattern objects.
### Methods 
- Compile( String regex ) : compiles a regex
- Matcher( CharSequence input ) : creates a matcher to search a string
- Matches( String regex, CharSequence Input ) : checks full string match.
- Split( CharSequence Input): splits input based on the pattern

```java
import java.util.regex.Pattern;

class PatternExample {
    public static void main(String[] args){
        System.out.println(Pattern.matches("pat.*", "patternmaster")); // true
        System.out.println(Pattern.matches("pattern[0-9]+", "paterns12i"));   // false
    }
}
```

## 2. Matcher class
- It performs matching operations for input strings. 
### Methods
- find() : Searches for pattern occurrences.
- start() / end() : returns start and end indices of a match.
- group() / groupCount() : retrieves matched subsequences.
- matches() : checks if the entire input matches the pattern.

```java
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class MatcherExample {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("geeks");
        Matcher m = p.matcher("geeksforgeeks.org");

        while (m.find()) {
            System.out.println("Pattern found from " + m.start() + " to " + (m.end() - 1));
        }
    }
}
```
## 3. Regex Character class
-  [ xyz ] : Matches x, y or z.
- [ ^xyz ] : Matches any character except x, y or z.
- [ a-zA-Z ] : Matches any character in the specified range.
- [ a-f[m-t] ] : Union of ranges a-f and m-t.
- [ a-z && [^m-p ] ] : Intersection of a-z excluding m-p.

```java
import java.util.regex.Pattern;

class CharClassExample {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[a-z]", "g"));      // true
        System.out.println(Pattern.matches("[a-zA-Z]", "Gfg")); // false
    }
}
```
### RegEx Quantifiers / Metacharacters

| Quantifier | Meaning                       | Example Matches                 |
| ---------- | ----------------------------- | ------------------------------- |
| X?         | Appears 0 or 1 time           | "a?" -> "", "a"                 |
| X+         | Appears 1 or more times       | "a+" -> "a", "aa"               |
| X*         | Appears 0 or more times       | "a*" -> "", "a", "aa"           |
| X{n}       | Appears exactly n times       | "a{3}" -> "aaa"                 |
| X{n,}      | Appears at least n times      | "a{2,}" -> "aa", "aaa"          |
| X{n,m}     | Appears between n and m times | "a{2,4}" -> "aa", "aaa", "aaaa" |
```java
System.out.println(Pattern.matches("\\d{4}", "1234")); // true
System.out.println(Pattern.matches("\\d{4}", "123"));  // false
System.out.println(Pattern.matches("[a-z]+", "hello")); // true
System.out.println(Pattern.matches("[a-z]+", ""));      // false
System.out.println(Pattern.matches("a*", "aaaa"));      // true
```

## Common Regex Patterns in Java

- ****. :**** Any character
- ****\d :**** Digit [0-9]
- ****\D :**** Non-digit
- ****\s :**** Whitespace
- ****\S :**** Non-whitespace
- ****\w :**** Word character [a-zA-Z0-9_]
- ****\W :**** Non-word character
- ****\b :**** Word boundary
- ****\B :**** Non-word boundary
```java
System.out.println(Pattern.matches("\\d+", "1234")); // true
System.out.println(Pattern.matches("\\D+", "1234")); // false
System.out.println(Pattern.matches("\\D+", "Gfg"));  // true
System.out.println(Pattern.matches("\\S+", "gfg"));  // true
```
