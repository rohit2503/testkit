__name__ = "hello"
class New(str):
    """
    """
    def __new__(cls, *args, **kwargs):
        """
        """
        print "__new__called"
        print args
        print kwargs
        print cls
        ob = str.__new__(cls,1)
        return ob
        
    def __init__(self, *args, **kwargs):
#         object.__init__(self, *args, **kwargs)
        
        print "__init__ called"

if __name__ == 'hello':
    
    n = New(1,2,3,4, name='rohit',city='seattle')
    print n
    print type(n)
    print dir(n)