class ParkingSystem {
    private var availableSlots: [Int: Int] = [:]
    
    init(_ big: Int, _ medium: Int, _ small: Int) {
        availableSlots[1] = big     
        availableSlots[2] = medium     
        availableSlots[3] = small
    }
    
    func addCar(_ carType: Int) -> Bool {
        if let availableSlot = availableSlots[carType], 
            availableSlot > 0 {
            availableSlots[carType] = availableSlot - 1
            return true
        } else {
            return false
        }
    }
}

// https://leetcode.com/problems/design-parking-system/submissions/1243046963/
