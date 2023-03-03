def reverserFunc(para):
    if ' ' not in para:
        return para[::-1]
    wordsInPara = para.split(' ')
    index = 0
    reversedWord = wordsInPara[index][::-1]
    return reversedWord + ' ' + reverserFunc(' '.join(wordsInPara[index+1:]))

para =input("Enter sentence: ")
reversed_para = reverserFunc(para)
print(reversed_para)