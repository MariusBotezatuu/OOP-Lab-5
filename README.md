# OOP-Lab-5
## World simulation!
Main entities:
- Humans:Can reproduce, the more humans -> more reproduction<br />
        Can kill each other in wars, the bigger the "evilness" attribute of the humans the more they kill each other<br />
        Can produce food and consume it when soil fertility = 0, if there is no food produced all the humans die<br />
        Have an impact on the environment, the more humans -> the faster the world temperature increases (global warming), this also decreases the world humidity <br />
        Can make the world's soil more fertile<br />
        Die when the water amount of the world = 100% or 0%<br />
        Have a parameter "intelligence" which increases over time. The more intelligence they have -> the less they have a negative impact on the environment.
        Furthermore, more intelligence -> less evilness. <br />
        As well as decreasing the population, human wars also slightly decrease their intelligence. <br />
        Have a set of world requirements that the world needs to adhere to for them to live<br />
- Sharks: Slow reproduction<br />
        Can kill each other but do so less often than humans<br />
        Die when the water amount of the world = 0%<br />
        The total amount of sharks that can exist in the world depends on the water amount of the world. The more water amount -> the more sharks can exist. <br />
        Have a set of world requirements that the world needs to adhere to for them to live<br />
- Rats : The fastest reproduction<br />
        Can kill each other but do so rarely (less often than sharks/humans)<br />
        By eating crops they decrease the soil fertility<br />
        Die when the water amount of the world = 100% or 0%<br />
        Have a set of world requirements that the world needs to adhere to for them to live<br />
- Weapons : Produced by humans, the more humans->the bigger the weapon amount<br />
        Is used by humans in their "wars", the more weapons->the more they kill each other<br />
        When humans have wars they could lose some or all of the weapons that they had. <br />
        Have a destruction level, just one weapon with a high enough destruction level can eliminate the entire human population!<br />
        The weapon's destruction level depends on the total amount of people + the people's intelligence. <br />
- Tsunami's : Have a destruction level and a duration<br />
        The bigger the destruction level and duration -> the more they increase the total water amount in the world and the world humidity <br />
        Each year they have a chance of 1/12 of happening<br />
- Earthquake's : Have a destruction level and a duration<br />
        The bigger the destruction level and duration -> the more they decrease fertility of the world's soil and increase the world's temperature <br />
        Each year they have a chance of 1/12 of happening<br />
        Just like in real life, earthquakes have a chance of producting tsunami's. So after an earthquake the probability of a tsunami happening immediately after it decreases
        from 1/12 to 1/8<br />
        
 ### The process of evolution!
 In this simulation I tried to add the concept of evolution, which works in the following way: people start out in small numbers, with 0 weapons and a very
 small level of intelligence. As the years go by humans reproduce, their intelligence slowly increases, they start making weapons and as they get smarter
 the destruction level of these weapons increases. They get to a point where the the number of people is quite high, they are much more intelligent then
 they were when the simulation started, they have lots of weapons with a very high destruction level and this results in "nuclear wars". As a result, a
 huge number of the population dies, they lose most of their weapons, the destruction level of the weapons goes all the way down and their intelligence
 decreases. The population basically starts from the beginning, however, their intelligence is higher this time. This cycle goes on and on, the population
 reaches the "brink" of their potential before collapsing, yet in the grand scheme of things, their intelligence has an upward trajectory. Once they have
 a high enough intelligence level humans can decrease the water amount of the world and temperature to satisfy their needs. Furthermore, with great
 intelligence comes great wisdom, so slowly they become less "evil". These cycles of violence continue for hundreds or even thousands of years until
 the population eventually reaches a point where their intelligence is extremely high, their evilness is 0 and they can thrive, build weapons and reproduce
 in peace, with no more wars and violence. <br /> <br /> <br />
  
  Polymorphism can be seen in the following: the classes Humans, Sharks and Rats all override certain methods from the abstract class Organisms. We can 
  also see method overloading in the classes Natural Calamities, Earthquakes and Tsunami's. <br />
  Further information can be seen in this image of the simulation hierarchy
  ![Screenshot from 2022-10-17 21-24-42](https://user-images.githubusercontent.com/113375838/196381757-185e79b6-c5b9-4c17-96c1-74c2ec44eb1b.png)
