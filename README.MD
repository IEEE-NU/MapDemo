## Recap
#### 1/26 - Loading JSON from a URL and showing it on the map
Recap: We pulled bus stops from Doublemap ([link](https://northwestern.doublemap.com/map/v2/stops))
using [Volley](https://developer.android.com/training/volley/index.html) and read it into our custom Stop data object.
Then, we display all of the bus stops as Markers on the map.

Homework: Pull all of the bus routes ([link](https://northwestern.doublemap.com/map/v2/routes))
and display them as [Polylines](https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polyline).
Be sure to give them colors based on the JSON data. The map looks a bit busy, right?
Allow the user to show or hide routes. One way is to use an [AlertDialog](http://www.learn-android-easily.com/2013/01/adding-check-boxes-in-dialog.html).
Another is to embed some [Checkboxes](https://developer.android.com/guide/topics/ui/controls/checkbox.html) in a view that you can show/hide.

Extra challenges, if you want:
* Write the code for pulling and showing bus routes from scratch, without looking at the code I wrote!
* Associate the stops with routes somehow and only show the stops for the selected routes
* After I select the routes I want to see, zoom out the map so I can see all of the stops

#### 2/2 - ListViews are hard!
Recap: We learned how to launch another activity with an Intent, and how to pass data along in the Intent. We then learned the intricacies of ListView and how to display a ListView with a custom adapter. A lot of tutorials on ListView are pretty bad, but the best I saw was [this one](https://github.com/codepath/android_guides/wiki/Using-an-ArrayAdapter-with-ListView).

Homework: Give the user a button to open either a new activity or an [AlertDialog](https://developer.android.com/guide/topics/ui/dialogs.html) with a ListView of routes. Use the [setOnItemClickListener](http://stackoverflow.com/questions/21295328/android-listview-with-onclick-items) method on the ListView to detect which route the user selected, and only show that one.

Extra challenges, if you want:
* Modify the ListView to have a checkbox for every item. Show as many routes as the user checks.
