# A python module that implements a Java interface to
# create a building object
from hello import BuildingInterface

class Building(BuildingInterface):
    def __init__(self, name, address, id):
        self.name = name
        self.address = address
        self.id = id

    def getBuildingName(self):
        return self.name

    def getBuildingAddress(self):
        return self.address

    def getBuldingId(self):
        return self.id






