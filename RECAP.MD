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
