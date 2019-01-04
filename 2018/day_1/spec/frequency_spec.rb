require 'frequency'

RSpec.describe Frequency do
  describe "compute" do
  it "matches the examples" do
    expect(Frequency.compute([1, 1, 1])).to eq(3)
    expect(Frequency.compute([1, 1, -2])).to eq(0)
    expect(Frequency.compute([-1, -2, -3])).to eq(-6)
  end
  end

  describe "find_first_duplicate" do
    it "matches the examples" do
      expect(Frequency.find_first_repeat([1, -1])).to eq(0)
      expect(Frequency.find_first_repeat([3, 3, 4, -2, -4])).to eq(10)
      expect(Frequency.find_first_repeat([-6, 3, 8, 5, -6])).to eq(5)
      expect(Frequency.find_first_repeat([7, 7, -2, -7, -4])).to eq(14)
    end
  end
end
