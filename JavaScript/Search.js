function linearSearch(array, item) {
  for (let i = 0; i < array.length; i++) if (item === array[i]) return i;

  return -1;
}

function binarySearch(array, item) {
  let left = 0;
  let right = array.length - 1;

  while (right >= left) {
    let midIndex = Math.floor((left + right) / 2);
    if (item === array[midIndex]) return midIndex;
    else if (item > array[midIndex]) left = midIndex + 1;
    else if (item < array[midIndex]) right = midIndex - 1;
  }
}
