from enum import Enum

class Order(Enum):
    ASC = 0
    DESC = 1

class Type(Enum):
    INT = (int, 0)
    STRING = (str, "")
    FLOAT = (float, 0.0)
    LAMBDA = (type(lambda:0), lambda:0)
    

