 *  Module 3, task 1. JavaCollectionsFramework. List.
 *
 * 1. Create ArrayList and LinkedList containing 10 000 Integer elements. Compare time intervals.
 * 2. Insert new 100 elements on the beginning, on the middle and on the end of ones. Compare time intervals.
 * 3. Update 100 elements from the beginning, from the middle and from the end of ones. Compare time intervals.
 * 4. Delete 100 elements from the beginning, from the middle and from the end of ones. Compare time intervals.

----------------------------------------------

RESULTS:

//--------ArrayList Initialization with 100000 el---------//

2020-06-21T19:14:51.666281700

2020-06-21T19:14:51.691283100

ArrayList initialization takes 25 ms

//--------LinkedList Initialization with 100000 el---------//

2020-06-21T19:14:51.723285

2020-06-21T19:14:51.750286500

LinkedList initialization takes 27 ms

----------------------------------------------------

//--------Inserting 3000 el into ArrayList---------//

2020-06-21T19:14:51.751286600

2020-06-21T19:14:51.817686900

Inserting 3000 elements into ArrayList takes 66 ms

//--------Inserting 3000 el into LinkedList---------//

2020-06-21T19:14:51.817686900

2020-06-21T19:14:52.099901300

Inserting 3000 elements into LinkedList takes 282 ms

------------------------------------------------------

//--------Updating 3000 el in ArrayList---------//

2020-06-21T19:14:52.100901400

2020-06-21T19:14:52.102901500

Updating 3000 elements in ArrayList takes 2 ms

//--------Updating 3000 el in LinkedList---------//

2020-06-21T19:14:52.103901600

2020-06-21T19:14:52.497924100

Updating 3000 elements in LinkedList takes 394 ms

----------------------------------------------------

//--------Deleting 3000 el in ArrayList---------//

2020-06-21T19:14:52.498924100

2020-06-21T19:14:52.600930

Deleting 3000 elements in ArrayList takes 102 ms

//--------Deleting 3000 el in LinkedList---------//

2020-06-21T19:14:52.602930100

2020-06-21T19:14:52.636932

Deleting 3000 elements in LinkedList takes 34 ms

-------------------------------------------------

Process finished with exit code 0
