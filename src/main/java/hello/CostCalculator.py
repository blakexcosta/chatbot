from hello import CostCalculatorType
class CostCalculator(CostCalculatorType, object):
    ''' Cost Calculator Utility '''
    def __init__(self):
        print('Initializing')
    pass
    # The implementation for the definition contained in the Java interface
    def calculateCost(self, salePrice, tax):
        return salePrice + (salePrice * tax)