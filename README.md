Campus Explore Page
    ↓
🗺️ 3D Campus Map (buildings in 3D/isometric view)
    ↓ (tap on building)
🏛️ Building Details Page (2D floor plans)
    ↓ (tap on floor)
📋 Floor Details (offices, classrooms, canteen)
    ↓ (tap on canteen)
🍽️ Canteen Menu Page (food items with prices)**



app/src/main/java/com/bms/college_explore/
├── ui/
│   ├── map/
│   │   ├── CampusMapFragment.kt      (3D map with buildings)
│   │   ├── MapViewModel.kt
│   │   └── BuildingMarkerAdapter.kt
│   ├── floorplan/
│   │   ├── FloorPlanActivity.kt      (2D floor plan with floors tab)
│   │   ├── FloorPlanView.kt          (Custom Canvas view)
│   │   └── RoomClickListener.kt
│   ├── canteen/
│   │   ├── CanteenMenuFragment.kt
│   │   └── MenuAdapter.kt
│   └── common/
│       └── BuildingData.kt            (Data class)
├── data/
│   ├── models/
│   │   ├── Building.kt
│   │   ├── Floor.kt
│   │   ├── Room.kt
│   │   └── MenuItem.kt
│   └── repository/
│       └── CampusRepository.kt        (Load JSON from assets)
└── utils/
    └── MapUtils.kt
