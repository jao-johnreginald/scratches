// Add the dependency to access the androidx PreferenceManager



// getDefaultSharedPreferences - used for storing things throughout the app

// val applicationPreferences = PreferenceManager.getDefaultSharedPreferences(this)
// applicationPreferences.edit {
//     putString("Data", "This is my data")
// }

// getPreferences - can call this from an Activity only, not very common

// val activityPreferences = getPreferences(Context.MODE_PRIVATE)
// activityPreferences.edit {
//     putInt("Data", 15)
// }

// getSharedPreferences - makes a shared preference file, can make as many files as needed

// val fileNamePreferences = getSharedPreferences("Name", Context.MODE_PRIVATE)
// fileNamePreferences.edit {
//     putBoolean("Data", false)
// }

// The old school Java way of storing values
//        val editor = runningPreferences.edit()
//        editor.putString("Record", record)
//        editor.putString("Date", date)
//        editor.apply()