from PIL import Image
import sys

try:
    fullimageFileName = sys.argv[1]

    operation = sys.argv[2]

    argument = sys.argv[3]

    if operation == '-f':
        
        r = fullimageFileName.split('.')

        imageFileName = r[0]

        im = Image.open(fullimageFileName)

        converted = im.convert('RGB')

        converted.save(f'{imageFileName}t.{argument}')


    elif operation == '-r':
        im = Image.open(fullimageFileName)
        r = argument.split('x')
        r_tuple = (int(r[0]), int(r[1]))
        out = im.resize(r_tuple)
        out.save(f'output_{fullimageFileName}')

except:
    print('Usage of converter')
    print('command:')
    print('python resizer.py [input file name] [operation] [argument]')
    print('Operation to be carried: ')
    print('-f : format image')
    print('Example:')
    print('1: python resizer.py image.jpeg -f png ')
    print('2: python resizer.py image.png -f jpeg ')
    print()
    print('-r :To resize image')
    print('Example:')
    print('1: python resizer.py image.jpeg -r 200x200 ')
    print('2: python resizer.py image.jpeg -r 250x200 ')