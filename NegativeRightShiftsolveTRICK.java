/*
 * Trick to solve negative Right Shift operator
 * 
 * {x / 2 ^ n }
 * 
 * For Example :- 100>>3 = 12.5
 * -100>>3 = -13
 * 
 * This Trick only works if division is completely take place just like above
 * example.....
 * 
 * 
 * This trick not work on complete division ..... for example 12>>2 =3
 * -12>>2=-3
 */