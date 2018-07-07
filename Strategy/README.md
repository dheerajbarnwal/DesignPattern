STRATEGY PATTERN

Category : Behavioral

also known as the policy pattern, that enables selecting an algorithm at runtime.
Instead of implementing a single algorithm directly, code receives run-time instructions as to which in a family of algorithms to use.

Used : Collections.sort() method that takes Comparator parameter.
Based on the different implementations of Comparator interfaces, the Objects are getting sorted in different ways.