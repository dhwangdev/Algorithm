def solution(s):
    s = list(s)
    idx = 0
    while idx < len(s)-1:
        if s[idx] == s[idx+1]:
            s.remove(s[idx])
            s.remove(s[idx])
            idx = 0
        else:
            idx += 1

    if len(s) == 0:
        return 1
    else:
        return 0
