#로그인 애플리케이션
def login(_id):
    members = ['ujoo', 'dong5', 'cotton']
    for member in members:
        if member == _id:
            return True
    return False
