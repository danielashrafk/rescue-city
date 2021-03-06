# Rescue City (Java & Swing)

Clone it and then open it in Eclipse IDE and run "controller\CommandCenter.java".

Rescue City revolves around YOU trying to save buildings (the occupants too) and people from disasters. When you click on any building or person, you can find all the information about the disaster happening to them in the information panel. You then need to click on the right rescue unit and then click on a building or a person to make the rescue unit respond. If you make an ambulance respond to a fire disaster, you will get a message displaying that it's not the right rescue unit to respond.
The game is controlled by cycles, not time. Which means that for the game to proceed and for something new to happen you need to click on the 'Next Cycle' button.
When a rescue unit arrives to a building or a person, they will turn yellow. When it starts rescuing, it will turn green. If a building collapses or a person dies, you will see that clearly on the map too. All units respond from the base, which means that if a building or a person is far away from the base, it will take more cycles to respond to them and hence the building might collapse or the person might die. A unit can only respond to one thing at a time, so if two building have a fire disaster, you need to wait for the first fire-fighting unit to finish rescuing the first building, and then make it respond to the second building (if you choose to make it respond to the other building it will leave the current building without completely rescuing it and will start responding to the other one). You can find information regarding health, fire damage, structural integrity etc. in the information panel. When a person's health (HP) reaches 0 he dies, and when the structural integrity of a building reaches 0 it collapses. 
When you rescue all buildings and people, the game will end and the number of casualties will be displayed.

![Screenshot](https://github.com/danielashrafk/rescue-city/blob/master/RescueSimulation-M2/r2.png)

![Screenshot](https://github.com/danielashrafk/rescue-city/blob/master/RescueSimulation-M2/r1.png)

![Screenshot](https://github.com/danielashrafk/rescue-city/blob/master/RescueSimulation-M2/r3.png)

![Screenshot](https://github.com/danielashrafk/rescue-city/blob/master/RescueSimulation-M2/r4.png)
