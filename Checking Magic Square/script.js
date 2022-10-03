/* Declare the 2D array */
var RachelMagic = [];

function input() {
  /*Fill the two-dimensional array with the users input using nested for loops*/

  for (i = 0; i <= 2; i++) {
    RachelMagic[i] = [];
    for (j = 0; j <= 2; j++) {
      var num = prompt(
        "Enter a number for row " + (i + 1) + ", column " + (j + 1) + ":",
        " "
      );
      var input = parseInt(num);
      RachelMagic[i][j] = input;
    }
  }

  /* Display the input numbers in the 9 table cells*/
  document.getElementById("sq1").innerHTML = RachelMagic[0][0];
  document.getElementById("sq2").innerHTML = RachelMagic[0][1];
  document.getElementById("sq3").innerHTML = RachelMagic[0][2];
  document.getElementById("sq4").innerHTML = RachelMagic[1][0];
  document.getElementById("sq5").innerHTML = RachelMagic[1][1];
  document.getElementById("sq6").innerHTML = RachelMagic[1][2];
  document.getElementById("sq7").innerHTML = RachelMagic[2][0];
  document.getElementById("sq8").innerHTML = RachelMagic[2][1];
  document.getElementById("sq9").innerHTML = RachelMagic[2][2];
}

function checkForMagic() {
  /* Check to make sure all numbers are positive */
  var magicPos = true;

  for (i = 0; i <= 2; i++) {
    for (j = 0; j <= 2; j++) {
      if (RachelMagic[i][j] < 0) {
        magicPos = false;
      }
    }
  }

  /* Check to see if rows and columns equal the same number */
  var row1 = RachelMagic[0][0] + RachelMagic[0][1] + RachelMagic[0][2];
  var row2 = RachelMagic[1][0] + RachelMagic[1][1] + RachelMagic[1][2];
  var row3 = RachelMagic[2][0] + RachelMagic[2][1] + RachelMagic[2][2];
  var col1 = RachelMagic[0][0] + RachelMagic[1][0] + RachelMagic[2][0];
  var col2 = RachelMagic[0][1] + RachelMagic[1][1] + RachelMagic[2][1];
  var col3 = RachelMagic[0][2] + RachelMagic[1][2] + RachelMagic[2][2];
  var magicSum = false;

  if (
    row1 === row2 &&
    row2 === row3 &&
    row3 === col1 &&
    col1 === col2 &&
    col2 === col3
  ) {
    magicSum = true;
  }

  /*Check to see if the two diagonals are equal (and equal to rows/ columns) */
  var diag1 = RachelMagic[0][0] + RachelMagic[1][1] + RachelMagic[2][2];
  var diag2 = RachelMagic[2][0] + RachelMagic[1][1] + RachelMagic[0][2];
  var magicDiag = false;

  if (diag1 === diag2 && diag2 === row1) {
    magicDiag = true;
  }

  /*If the square passes all checks, it is a magic square */
  if (magicPos === true && magicSum === true && magicDiag === true) {
    document.getElementById("results").innerHTML =
      "Wow! This is a magic square!";
  } else {
    document.getElementById("results").innerHTML =
      "Sorry, your square is not a magic square.";
  }

  /*To label the results box */
  document.getElementById("title").innerHTML = "Result: ";
}
