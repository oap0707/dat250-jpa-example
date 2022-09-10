# Short report

## Technical Problems:
I got an error with COUNT not being in a table (or 
something similar, I can't quite remember),
but I realized I forgot to specify in persistence.xml 
file to have a value here:

<property name="javax.persistence.jdbc.url"
value="jdbc:derby:C:\Users\Olesy\simpleDb;create=true"/>.

When I added this the problem went away. 

I also had a minor issue with the test not passing
when it came to is(Set.of(person)), but that was because
I defined the owners set wrong, I wrote Collections<Person> = new HashSet<>()
instead of Set<Person> owners = new HashSet<>().

#
## Link to the project:
https://github.com/oap0707/dat250-jpa-example

#
## Explanation of database inspection:
I don't know why but I didn't manage to inspect the database
at all, even though I installed Intellij Ultimate. Maybe there
was an issue but I didn't figure it out.

#
## Any pending issues:
At the moment no inspection of database.

