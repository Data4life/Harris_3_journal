void setup() {
  size(1000, 1000);
  color(#FF00FF);
}

void draw() {
  if (mousePressed) {
    fill(564131245);
  } else {
    fill(#00FFFF);

  }
  ellipse(mouseX, mouseY, 50, 50);
  rect(mouseX, mouseY, 50, 50);
  rect(mouseX, mouseY, -50, -50);
 
}